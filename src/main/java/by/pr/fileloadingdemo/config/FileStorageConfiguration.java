package by.pr.fileloadingdemo.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Getter
@Setter
@Configuration
public class FileStorageConfiguration {
    @Value(value = "${file.upload-dir}")
    private String uploadDir;

}
