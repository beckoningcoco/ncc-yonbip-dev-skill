# |<<

**江西医保对照 (jxhp_map / com.yonyou.yh.nhis.hp.jx.city.vo.JXHPMapVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3537.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_hpmap | 主键 | pk_hpmap | char(20) | √ | 主键 (UFID) |
| 2 | eu_itemtype | 目录类型 | eu_itemtype | int | √ | 整数 (Integer) |
| 3 | pk_hisitem | HIS主键 | pk_hisitem | varchar(50) | √ | 字符串 (String) |
| 4 | his_code | HIS编码 | his_code | varchar(50) | √ | 字符串 (String) |
| 5 | his_name | HIS名称 | his_name | varchar(100) | √ | 字符串 (String) |
| 6 | his_mnecode | HIS助记码 | his_mnecode | varchar(50) |  | 字符串 (String) |
| 7 | pk_hpitem | 医保主键 | pk_hpitem | varchar(50) |  | 字符串 (String) |
| 8 | hp_code | 医保编码 | hp_code | varchar(50) |  | 字符串 (String) |
| 9 | hp_name | 医保名称 | hp_name | varchar(100) |  | 字符串 (String) |
| 10 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 11 | pk_org | 组织 | pk_org | varchar(20) |  | 组织 (org) |
| 12 | pk_org_v | 组织版本 | pk_org_v | varchar(20) |  | 组织_版本信息 (org_v) |
| 13 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 14 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 15 | modifier | 修改人 | modifier | varchar(20) |  | 用户 (user) |
| 16 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |