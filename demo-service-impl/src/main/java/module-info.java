module org.ecuadorjug.service.impl {
    requires org.ecuadorjug.service.spi;
	requires org.ecuadorjug.model.person;
	requires org.ecuadorjug.service;
	provides org.ecuadorjug.service.spi.PersonServiceProvider
		with org.ecuadorjug.service.impl.PersonServiceImpl;
}