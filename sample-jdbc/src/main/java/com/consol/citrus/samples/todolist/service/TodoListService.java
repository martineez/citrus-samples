/*
 * Copyright 2006-2016 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.consol.citrus.samples.todolist.service;

import com.consol.citrus.samples.todolist.dao.JdbcTodoListDao;
import com.consol.citrus.samples.todolist.dao.TodoListDao;
import com.consol.citrus.samples.todolist.model.TodoEntry;

import java.util.List;

/**
 * @author Christoph Deppisch
 */
public class TodoListService {

    /** In memory storage */
    private TodoListDao todoListDao = new JdbcTodoListDao();

    public void addEntry(TodoEntry entry) {
        todoListDao.save(entry);
    }

    public List<TodoEntry> getAllEntries() {
        return todoListDao.list();
    }
}
