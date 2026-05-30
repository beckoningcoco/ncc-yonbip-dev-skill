# |<<

**位置管理 (bd_uh_place / com.yonyou.yh.nhis.bd.uhplace.vo.UhPlaceVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1086.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_place | 地点主键 | pk_place | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) | √ | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | varchar(20) |  | 组织_业务单元_医卫 (hisorg) |
| 4 | code_place | 地点编码 | code_place | varchar(50) |  | 字符串 (String) |
| 5 | name_place | 地点全称 | name_place | varchar(200) |  | 多语文本 (MultiLangText) |
| 6 | desc_place | 地点描述 | desc_place | varchar(200) |  | 备注 (Memo) |
| 7 | name | 地点简称 | name | varchar(50) |  | 字符串 (String) |
| 8 | pk_father | 上级地点 | pk_father | varchar(20) |  | 位置管理 (uhplace) |
| 9 | innercode | 内部码 | innercode | varchar(200) |  | 备注 (Memo) |
| 10 | mnecode | 助记码 | mnecode | varchar(50) |  | 字符串 (String) |
| 11 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 12 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 13 | modifier | 修改人 | modifier | varchar(20) |  | 用户 (user) |
| 14 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |