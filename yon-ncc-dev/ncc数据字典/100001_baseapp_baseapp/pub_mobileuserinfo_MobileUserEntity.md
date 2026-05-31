# |<<

**MobileUserEntity (pub_mobileuserinfo / nccloud.mobile.vo.MobileUserEntity)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4737.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_mobileuser | ID | pk_mobileuser | char(20) | √ | 主键 (UFID) |
| 2 | phone | 手机号 | phone | varchar(50) |  | 字符串 (String) |
| 3 | name | 姓名 | name | varchar(50) |  | 字符串 (String) |
| 4 | enabled | 启用状态 | enabled | int |  | 启用状态 (enablestatus) |  | 0=已启用; |