/*
 * Copyright (c) 2021 Franco Sánchez Flores
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and
 * associated documentation files (the "Software"), to deal in the Software without restriction, including
 * without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the
 * following conditions: The above copyright notice and this permission notice shall be included in all copies
 * or substantial portions of the Software. THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
 * EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A
 * PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE
 * FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE,
 * ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package cl.ucn.disc.fsanchez.news.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import cl.ucn.disc.fsanchez.news.model.News;
import cl.ucn.disc.fsanchez.news.service.Contracts;
import cl.ucn.disc.fsanchez.news.service.ContractsImplFaker;

/**
 * @author Franco Sanchez-Flores
 */
public class TestContractsImplFaker {

  /**
   * Testing the Constructor.
   */
  @Test
  public void testConstructor() {

    // Nothing here

  }

  /**
   * Testing the RetrieveNews
   */
  @Test
  public void testRetrieveNews() {

    final Contracts contracts = new ContractsImplFaker();
    Assertions.assertNotNull(contracts, "Contracts was null");

    final int N = 10;
    final List<News> listNews = contracts.retrieveNews(N);
    Assertions.assertNotNull(listNews, "Contracts was nill");
    Assertions.assertEquals(N, listNews.size(), "Wrong number of elements");
  }
}
