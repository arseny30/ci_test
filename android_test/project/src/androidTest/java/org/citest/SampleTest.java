/*
 * This file is part of TD.
 *
 * TD is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 2 of the License, or
 * (at your option) any later version.
 *
 * TD is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with TD.  If not, see <http://www.gnu.org/licenses/>.
 *
 * Copyright 2014-2015 Arseny Smirnov
 *           2014-2015 Aliaksei Levin
 */

package org.citest;

import android.support.test.filters.SmallTest;
import android.support.test.runner.AndroidJUnit4;
import android.util.Log;

import junit.framework.TestCase;

import org.junit.Test;
import org.junit.runner.RunWith;

import java.math.BigInteger;
import java.util.Random;

import static junit.framework.Assert.assertEquals;

@RunWith(AndroidJUnit4.class)
@SmallTest
public class SampleTest {
  @Test
  public void sample() {
    assertEquals(1, 2);
  }

}

