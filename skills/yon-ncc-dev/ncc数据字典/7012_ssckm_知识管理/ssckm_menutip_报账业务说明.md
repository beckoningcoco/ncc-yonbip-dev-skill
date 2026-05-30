# |<<

**报账业务说明 (ssckm_menutip / nc.vo.ssckm.kmmenutip.KmMenuTipVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5561.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_menutip | 主键 | pk_menutip | char(20) | √ | 主键 (UFID) |
| 2 | content | 内容 | content | varchar(200) |  | 备注 (Memo) |
| 3 | pk_menuitem | 菜单id | pk_menuitem | varchar(50) |  | 字符串 (String) |
| 4 | menuitemcode | 菜单编码 | menuitemcode | varchar(50) |  | 字符串 (String) |
| 5 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 6 | modifytime | 最终修改时间 | modifytime | char(19) |  | 日期时间 (UFDateTime) |
| 7 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 8 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 9 | modifier | 最终修改人 | modifier | varchar(20) |  | 用户 (user) |