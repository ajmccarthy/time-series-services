package gov.usgs.wma.waterdata.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;

@Tag(name="Application Version", description="Data Download")
@RestController
public class VersionController {

	@Operation(
			description="Return the web service version information.",
			responses= {
					@ApiResponse(content=@Content(schema=@Schema(nullable=true)))
			})
	@GetMapping(
			value="version",
			produces=MediaType.APPLICATION_JSON_VALUE
	)
	public RedirectView getVersion(RedirectAttributes attributes) {
		return new RedirectView("/about/info", true, false);
	}
}