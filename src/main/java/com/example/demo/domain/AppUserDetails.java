package com.example.demo.domain;

import java.util.Collection;
import java.util.Date;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@SuppressWarnings("serial")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AppUserDetails implements UserDetails {

	@NotEmpty
	@Min(value = 1)
	private String user_id;
	private String password;
	private Date passUpdateDate;
	private int loginMissTimes;
	private boolean unlock;
	private boolean enabled;
	private Date userDueDate;

	private Collection<? extends GrantedAuthority> authority;
	private String tenantId;
	private String appUserName;
	private String mailAddress;

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {

		return authority;
	}

	@Override
	public String getPassword() {

		return this.password;
	}

	@Override
	public String getUsername() {

		return this.user_id;
	}

	@Override
	public boolean isAccountNonExpired() {

		if (this.userDueDate.after(new Date())) {
			return true;
		} else {
			return false;
		}

	}

	@Override
	public boolean isAccountNonLocked() {

		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {

		return true;
	}

	@Override
	public boolean isEnabled() {

		return this.enabled;
	}

}
