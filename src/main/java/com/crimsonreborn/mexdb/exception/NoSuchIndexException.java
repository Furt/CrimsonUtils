package com.crimsonreborn.mexdb.exception;
 
/**
 * Copyright (C) 2012-2013 Moser Luca <moser.luca@gmail.com> 
 * Updated and maintained by Furt <furt1337@live.com>
 *
 * This file is part of MexDB. 
 *  
 * MexDB is free software: you can redistribute it and/or modify it under 
 * the terms of the GNU General Public License as published by the Free Software 
 * Foundation, either version 3 of the License, or (at your option) any later 
 * version. 
 *  
 * MexDB is distributed in the hope that it will be useful, but WITHOUT 
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS 
 * FOR A PARTICULAR PURPOSE. See the GNU General Public License for more 
 * details. 
 *  
 * You should have received a copy of the GNU General Public License along with 
 * Foobar. If not, see <http://www.gnu.org/licenses/>. 
 */ 
 
/**
 * Thrown when an invalid/nonexistent index is passed as a parameter. 
 */ 
public class NoSuchIndexException extends Exception { 
 
 private static final long serialVersionUID = 1L; 
 
 /**
  * Thrown when an invalid/nonexistent index is passed as a parameter. 
  */ 
 public NoSuchIndexException(String msg) { 
  super(msg); 
 } 
 
}
