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

package cl.ucn.disc.fsanchez.news.model;

import net.openhft.hashing.LongHashFunction;

import org.threeten.bp.ZonedDateTime;

import lombok.Getter;

/**
 * The News class.
 * @author Franco Sanchez-Flores
 */
public final class News {

  /**
   * ID unique.
   */
  @Getter
  private final Long id;

  /**
   * The title.
   */
  @Getter
  private String title;

  /**
   * The Source.
   */
  @Getter
  private final String source;

  /**
   * The author.
   */
  @Getter
  private final String author;

  /**
   * The URL.
   */
  @Getter
  private final String url;

  /**
   * The URL image.
   */
  @Getter
  private final String urlImage;

  /**
   * The Description.
   */
  @Getter
  private final String description;

  /**
   * The content.
   */
  @Getter
  private final String content;

  /**
   * The date of publish;
   */
  @Getter
  private final ZonedDateTime publishedAt;

  /**
   * The Constructor of News.
   * @param title can't be null.
   * @param source can't be null.
   * @param author can't be null.
   * @param url can be null.
   * @param urlImage can be null.
   * @param description can't be null.
   * @param content can't be null.
   * @param publishedAt can't be null.
   */
  public News(final String title,
              final String source,
              final String author,
              final String url,
              final String urlImage,
              final String description,
              final String content,
              final ZonedDateTime publishedAt) {

    // Title
    if (title == null || title.length() < 2) {
      throw new IllegalArgumentException("Title required");
    }
    this.title = title;
    // Source
    if (source == null || source.length() < 2) {
      throw new IllegalArgumentException("Source required");
    }
    this.source = source;

    // Author
    if (author == null || author.length() < 3) {
      throw new IllegalArgumentException("Author required");
    }
    this.author = author;

    //ID: Hashing(title + | + source + | + author)
    this.id = LongHashFunction.xx().hashChars(title + "|" + source + "|" + author);

    this.url = url;
    this.urlImage = urlImage;

    if (description == null || description.length() < 4) {
      throw new IllegalArgumentException("Description required");
    }
    this.description = description;

    if (content == null || content.length() < 2) {
      throw new IllegalArgumentException("Content required");
    }
    this.content = content;

    if (publishedAt == null) {
      throw new IllegalArgumentException("Published At required");
    }
    this.publishedAt = publishedAt;
  }
}
