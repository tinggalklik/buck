/*
 * Copyright 2016-present Facebook, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License. You may obtain
 * a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */

package com.facebook.buck.intellij.plugin.build;

import com.google.common.util.concurrent.FutureCallback;
import com.intellij.execution.process.ProcessOutputTypes;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.util.Key;
import com.intellij.openapi.vfs.VfsUtil;
import com.intellij.openapi.vfs.VirtualFile;

import java.util.Iterator;

public class ResultCallbackBuckHandler extends BuckCommandHandler {
  private final FutureCallback futureCallback;
  private StringBuilder stdout;

  public ResultCallbackBuckHandler(
      final Project project,
      final VirtualFile root,
      final BuckCommand command,
      final FutureCallback futureCallback) {
    super(project, VfsUtil.virtualToIoFile(root), command);
    this.futureCallback = futureCallback;
    this.stdout = new StringBuilder();
  }

  @Override
  protected void notifyLines(Key outputType, Iterator<String> lines, StringBuilder lineBuilder) {
    super.notifyLines(outputType, lines, lineBuilder);
    if (outputType == ProcessOutputTypes.STDOUT) {
      while (lines.hasNext()) {
        stdout.append(lines.next());
      }
    }
  }

  @Override
  protected boolean beforeCommand() {
    return true;
  }

  @Override
  protected void afterCommand() {
    String result = stdout.toString();
    if (!result.isEmpty()) {
      futureCallback.onSuccess(stdout.toString());
    }
  }
}
