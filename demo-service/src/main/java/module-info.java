module org.ecuadorjug.service {
    requires org.ecuadorjug.service.spi;
    requires org.ecuadorjug.model.person;
    exports org.ecuadorjug.service;
    uses  org.ecuadorjug.service.spi.PersonServiceProvider;
}