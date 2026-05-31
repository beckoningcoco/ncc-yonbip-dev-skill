# |<<

**公卫领域定义 (bd_uh_ph / com.yonyou.yh.nhis.bd.phdomain.vo.PhDomainVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1078.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_ph | 公卫领域主键 | pk_ph | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | code | 公卫领域编码 | code | varchar(30) |  | 字符串 (String) |
| 5 | name | 公卫领域名称 | name | varchar(50) |  | 多语文本 (MultiLangText) |
| 6 | dy_phtype | 公卫领域类型 | dy_phtype | varchar(20) |  | 公卫领域类型(自定义档案) (Defdoc-070006) |
| 7 | guide_ph | 公卫服务规范描述 | guide_ph | varchar(256) |  | 备注 (Memo) |
| 8 | sortno | 排序 | sortno | int |  | 整数 (Integer) |
| 9 | flag_active | 起用标志 | flag_active | char(1) |  | 布尔类型 (UFBoolean) |
| 10 | note | 备注 | note | varchar(256) |  | 备注 (Memo) |
| 11 | pk_org_v | 组织多版本 | pk_org_v | varchar(20) |  | 组织_业务单元_医卫版本 (hisorg_v) |
| 12 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 13 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 14 | modifier | 修改人 | modifier | varchar(20) |  | 用户 (user) |
| 15 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |