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
@NoArgsConstructor // フィールドなし�?�コンストラクタを�?�動で作�??
@AllArgsConstructor // 全てのフィールドを引数に持つコンストラクタを�?�動で作�?�す�?
@Builder // Builderクラスを�?�動で作�?�す�?
public class AppUserDetails implements UserDetails {
	
	@NotEmpty(message = "入力エラーで�?")
	@Min(value = 1)
	private String user_id; 
	private String password;
	private Date passUpdateDate; //パスワード更新日
	private int loginMissTimes; //ログイン失敗回数
	private boolean unlock; //ロ�?ク状態フラグ
	private boolean enabled; // 有効・無効フラグ
	private Date userDueDate; // ユーザー有効期限
	// 権限�?�コレクション
	private Collection<? extends GrantedAuthority> authority;
	private String tenantId; //�?ナン�?ID
	private String appUserName; // ユーザー�?
	private String mailAddress; //メア�?
	
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO 自動生成されたメソ�?ド�?�スタ�?
		return authority;
	}

	@Override
	public String getPassword() {
		// TODO 自動生成されたメソ�?ド�?�スタ�?
		return this.password;
	}

	@Override
	public String getUsername() {
		// TODO 自動生成されたメソ�?ド�?�スタ�?
		return this.user_id;
	}

	/*
	 * アカウント�?�有効期限チェ�?ク
	 * true:有効  false:無効
	 */
	@Override
	public boolean isAccountNonExpired() {
		// TODO 自動生成されたメソ�?ド�?�スタ�?
		if(this.userDueDate.after(new Date())) {
			return true;
		}else {
			return false;
		}
		
	}

	/*
	 * アカウント�?�ロ�?クチェ�?ク
	 */
	@Override
	public boolean isAccountNonLocked() {
		// TODO 自動生成されたメソ�?ド�?�スタ�?
		return true;
	}

	// パスワード�?�有効期限
	@Override
	public boolean isCredentialsNonExpired() {
		// TODO 自動生成されたメソ�?ド�?�スタ�?
		return true;
	}

	@Override
	public boolean isEnabled() {
		// TODO 自動生成されたメソ�?ド�?�スタ�?
		return this.enabled;
	}

	

}
