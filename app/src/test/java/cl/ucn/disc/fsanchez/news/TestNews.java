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

package cl.ucn.disc.fsanchez.news;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.threeten.bp.ZoneId;
import org.threeten.bp.ZonedDateTime;

import lombok.extern.slf4j.Slf4j;

/**
 * Test of {@link News}.
 * @author Franco Sanchez-Flores
 */
@Slf4j
public class TestNews {

  /**
   * Test the Constructor.
   */
  @Test
  public void testConstructor() {

    log.debug("Testing Constructor ..");
    // Constructor OK
    {
      News news = new News(
          "Constituyente del pueblo Rapa Nui destaca trabajo de colaboración con la UCN",
          "Noticias UCN",
          "UCN",
          "https://www.noticias.ucn.cl/destacado/constituyente-del-pueblo-rapa-nui-destaca-trabajo-de-colaboracion-con-la-ucn/",
          "https://www.noticias.ucn.cl/wp-content/uploads/2021/11/11.jpg",
          "Tiare Aguilera se reunió con autoridades universitarias, con estudiantes de Rapa Nui, con investigadores de ESMOI, autoridades de la Facultad de Ciencias del Mar, el Consejo de Sede y dirigentes estudiantiles.",
          "La relación entre la Universidad Católica del Norte (UCN) y la Isla de Pascua comenzó hace  varios años, alianza que ha permitido a isleños obtener becas para estudiar en la universidad, recibir capacitación técnica y apoyo en la conservación del entorno marino, mientras que la universidad desarrolla investigaciones científicas y mantiene un trabajo constante a través del Centro de Ecología y Manejo Sustentable de Islas Oceánicas (ESMOI). Considerando esta alianza, y que debido a las medidas sanitarias no se puede viajar a la isla, Tiare Aguilera, convencional constituyente representante electa por el escaño reservado del pueblo Rapa Nui, aprovechó la semana territorial para visitar la UCN. Mi idea, dijo, “fue visitar la UCN por la relación que tiene hace bastante tiempo con Rapa Nui, a través de investigaciones, de relaciones de trabajo, de la entrega de becas a estudiantes que han podido cursar carreras muy relacionadas con lo que nosotros necesitamos, que son pertinente para la situación local”.",
          ZonedDateTime.now(ZoneId.of("-4"))


      );
      Assertions.assertNotNull(news, "The News was null");
      Assertions.assertNotNull(news.getId(), "The ID was null");
      Assertions.assertNotNull(news.getTitle(), "The Title was null");
      Assertions.assertNotNull(news.getSource(), "The Source was null");
      Assertions.assertNotNull(news.getAuthor(), "The Author was null");
      Assertions.assertNotNull(news.getUrl(), "The URL was null");
      Assertions.assertNotNull(news.getUrlImage(), "The URL Image was null");
      Assertions.assertNotNull(news.getDescription(), "The Description was null");
      Assertions.assertNotNull(news.getContent(), "The Content was null");
    }

    // Constructor NOT OK
    {
      Assertions.assertThrows(IllegalArgumentException.class, () -> new News(
              null,
              "Noticias UCN",
              "UCN",
              "https://www.noticias.ucn.cl/destacado/constituyente-del-pueblo-rapa-nui-destaca-trabajo-de-colaboracion-con-la-ucn/",
              "https://www.noticias.ucn.cl/wp-content/uploads/2021/11/11.jpg",
              "Tiare Aguilera se reunió con autoridades universitarias, con estudiantes de Rapa Nui, con investigadores de ESMOI, autoridades de la Facultad de Ciencias del Mar, el Consejo de Sede y dirigentes estudiantiles.",
              "La relación entre la Universidad Católica del Norte (UCN) y la Isla de Pascua comenzó hace  varios años, alianza que ha permitido a isleños obtener becas para estudiar en la universidad, recibir capacitación técnica y apoyo en la conservación del entorno marino, mientras que la universidad desarrolla investigaciones científicas y mantiene un trabajo constante a través del Centro de Ecología y Manejo Sustentable de Islas Oceánicas (ESMOI). Considerando esta alianza, y que debido a las medidas sanitarias no se puede viajar a la isla, Tiare Aguilera, convencional constituyente representante electa por el escaño reservado del pueblo Rapa Nui, aprovechó la semana territorial para visitar la UCN. Mi idea, dijo, “fue visitar la UCN por la relación que tiene hace bastante tiempo con Rapa Nui, a través de investigaciones, de relaciones de trabajo, de la entrega de becas a estudiantes que han podido cursar carreras muy relacionadas con lo que nosotros necesitamos, que son pertinente para la situación local”.",
              ZonedDateTime.now(ZoneId.of("-4"))
      ));

      Assertions.assertThrows(IllegalArgumentException.class, () -> new News(
              "Constituyente del pueblo Rapa Nui destaca trabajo de colaboración con la UCN",
              null,
              "UCN",
              "https://www.noticias.ucn.cl/destacado/constituyente-del-pueblo-rapa-nui-destaca-trabajo-de-colaboracion-con-la-ucn/",
              "https://www.noticias.ucn.cl/wp-content/uploads/2021/11/11.jpg",
              "Tiare Aguilera se reunió con autoridades universitarias, con estudiantes de Rapa Nui, con investigadores de ESMOI, autoridades de la Facultad de Ciencias del Mar, el Consejo de Sede y dirigentes estudiantiles.",
              "La relación entre la Universidad Católica del Norte (UCN) y la Isla de Pascua comenzó hace  varios años, alianza que ha permitido a isleños obtener becas para estudiar en la universidad, recibir capacitación técnica y apoyo en la conservación del entorno marino, mientras que la universidad desarrolla investigaciones científicas y mantiene un trabajo constante a través del Centro de Ecología y Manejo Sustentable de Islas Oceánicas (ESMOI). Considerando esta alianza, y que debido a las medidas sanitarias no se puede viajar a la isla, Tiare Aguilera, convencional constituyente representante electa por el escaño reservado del pueblo Rapa Nui, aprovechó la semana territorial para visitar la UCN. Mi idea, dijo, “fue visitar la UCN por la relación que tiene hace bastante tiempo con Rapa Nui, a través de investigaciones, de relaciones de trabajo, de la entrega de becas a estudiantes que han podido cursar carreras muy relacionadas con lo que nosotros necesitamos, que son pertinente para la situación local”.",
              ZonedDateTime.now(ZoneId.of("-4"))
      ));

      Assertions.assertThrows(IllegalArgumentException.class, () -> new News(
              "Noticias UCN",
              "Noticias UCN",
              null,
              "https://www.noticias.ucn.cl/destacado/constituyente-del-pueblo-rapa-nui-destaca-trabajo-de-colaboracion-con-la-ucn/",
              "https://www.noticias.ucn.cl/wp-content/uploads/2021/11/11.jpg",
              "Tiare Aguilera se reunió con autoridades universitarias, con estudiantes de Rapa Nui, con investigadores de ESMOI, autoridades de la Facultad de Ciencias del Mar, el Consejo de Sede y dirigentes estudiantiles.",
              "La relación entre la Universidad Católica del Norte (UCN) y la Isla de Pascua comenzó hace  varios años, alianza que ha permitido a isleños obtener becas para estudiar en la universidad, recibir capacitación técnica y apoyo en la conservación del entorno marino, mientras que la universidad desarrolla investigaciones científicas y mantiene un trabajo constante a través del Centro de Ecología y Manejo Sustentable de Islas Oceánicas (ESMOI). Considerando esta alianza, y que debido a las medidas sanitarias no se puede viajar a la isla, Tiare Aguilera, convencional constituyente representante electa por el escaño reservado del pueblo Rapa Nui, aprovechó la semana territorial para visitar la UCN. Mi idea, dijo, “fue visitar la UCN por la relación que tiene hace bastante tiempo con Rapa Nui, a través de investigaciones, de relaciones de trabajo, de la entrega de becas a estudiantes que han podido cursar carreras muy relacionadas con lo que nosotros necesitamos, que son pertinente para la situación local”.",
              ZonedDateTime.now(ZoneId.of("-4"))
      ));

      Assertions.assertThrows(IllegalArgumentException.class, () -> new News(
              "Noticias UCN",
              "Noticias UCN",
              "UCN",
              null,
              "https://www.noticias.ucn.cl/wp-content/uploads/2021/11/11.jpg",
              "Tiare Aguilera se reunió con autoridades universitarias, con estudiantes de Rapa Nui, con investigadores de ESMOI, autoridades de la Facultad de Ciencias del Mar, el Consejo de Sede y dirigentes estudiantiles.",
              "La relación entre la Universidad Católica del Norte (UCN) y la Isla de Pascua comenzó hace  varios años, alianza que ha permitido a isleños obtener becas para estudiar en la universidad, recibir capacitación técnica y apoyo en la conservación del entorno marino, mientras que la universidad desarrolla investigaciones científicas y mantiene un trabajo constante a través del Centro de Ecología y Manejo Sustentable de Islas Oceánicas (ESMOI). Considerando esta alianza, y que debido a las medidas sanitarias no se puede viajar a la isla, Tiare Aguilera, convencional constituyente representante electa por el escaño reservado del pueblo Rapa Nui, aprovechó la semana territorial para visitar la UCN. Mi idea, dijo, “fue visitar la UCN por la relación que tiene hace bastante tiempo con Rapa Nui, a través de investigaciones, de relaciones de trabajo, de la entrega de becas a estudiantes que han podido cursar carreras muy relacionadas con lo que nosotros necesitamos, que son pertinente para la situación local”.",
              ZonedDateTime.now(ZoneId.of("-4"))
      ));

      Assertions.assertThrows(IllegalArgumentException.class, () -> new News(
              "Noticias UCN",
              "Noticias UCN",
              "UCN",
              "https://www.noticias.ucn.cl/wp-content/uploads/2021/11/11.jpg",
              null,
              "Tiare Aguilera se reunió con autoridades universitarias, con estudiantes de Rapa Nui, con investigadores de ESMOI, autoridades de la Facultad de Ciencias del Mar, el Consejo de Sede y dirigentes estudiantiles.",
              "La relación entre la Universidad Católica del Norte (UCN) y la Isla de Pascua comenzó hace  varios años, alianza que ha permitido a isleños obtener becas para estudiar en la universidad, recibir capacitación técnica y apoyo en la conservación del entorno marino, mientras que la universidad desarrolla investigaciones científicas y mantiene un trabajo constante a través del Centro de Ecología y Manejo Sustentable de Islas Oceánicas (ESMOI). Considerando esta alianza, y que debido a las medidas sanitarias no se puede viajar a la isla, Tiare Aguilera, convencional constituyente representante electa por el escaño reservado del pueblo Rapa Nui, aprovechó la semana territorial para visitar la UCN. Mi idea, dijo, “fue visitar la UCN por la relación que tiene hace bastante tiempo con Rapa Nui, a través de investigaciones, de relaciones de trabajo, de la entrega de becas a estudiantes que han podido cursar carreras muy relacionadas con lo que nosotros necesitamos, que son pertinente para la situación local”.",
              ZonedDateTime.now(ZoneId.of("-4"))
      ));

      Assertions.assertThrows(IllegalArgumentException.class, () -> new News(
              "Noticias UCN",
              "Noticias UCN",
              "UCN",
              "https://www.noticias.ucn.cl/wp-content/uploads/2021/11/11.jpg",
              "https://www.noticias.ucn.cl/wp-content/uploads/2021/11/11.jpg",
              null,
              "La relación entre la Universidad Católica del Norte (UCN) y la Isla de Pascua comenzó hace  varios años, alianza que ha permitido a isleños obtener becas para estudiar en la universidad, recibir capacitación técnica y apoyo en la conservación del entorno marino, mientras que la universidad desarrolla investigaciones científicas y mantiene un trabajo constante a través del Centro de Ecología y Manejo Sustentable de Islas Oceánicas (ESMOI). Considerando esta alianza, y que debido a las medidas sanitarias no se puede viajar a la isla, Tiare Aguilera, convencional constituyente representante electa por el escaño reservado del pueblo Rapa Nui, aprovechó la semana territorial para visitar la UCN. Mi idea, dijo, “fue visitar la UCN por la relación que tiene hace bastante tiempo con Rapa Nui, a través de investigaciones, de relaciones de trabajo, de la entrega de becas a estudiantes que han podido cursar carreras muy relacionadas con lo que nosotros necesitamos, que son pertinente para la situación local”.",
              ZonedDateTime.now(ZoneId.of("-4"))
      ));

      Assertions.assertThrows(IllegalArgumentException.class, () -> new News(
              "Noticias UCN",
              "Noticias UCN",
              "UCN",
              "https://www.noticias.ucn.cl/wp-content/uploads/2021/11/11.jpg",
              "https://www.noticias.ucn.cl/wp-content/uploads/2021/11/11.jpg",
              "Tiare Aguilera se reunió con autoridades universitarias, con estudiantes de Rapa Nui, con investigadores de ESMOI, autoridades de la Facultad de Ciencias del Mar, el Consejo de Sede y dirigentes estudiantiles.",
              null,
              ZonedDateTime.now(ZoneId.of("-4"))
      ));
    }

  }
}
