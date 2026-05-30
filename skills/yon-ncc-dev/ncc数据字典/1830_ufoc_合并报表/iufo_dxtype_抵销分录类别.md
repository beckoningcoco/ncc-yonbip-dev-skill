# |<<

**抵销分录类别 (iufo_dxtype / nc.vo.hbbb.dxtype.DXTypeVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3429.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_dxtype | 主键 | pk_dxtype | char(20) | √ | 主键 (UFID) |
| 2 | code | 凭证类别编码 | code | int |  | 整数 (Integer) |
| 3 | name | 凭证类别名称 | name | varchar(200) |  | 多语文本 (MultiLangText) |
| 4 | note | 说明 | note | varchar(200) |  | 多语文本 (MultiLangText) |
| 5 | isbuiltin | 是否预置 | isbuiltin | char(1) |  | 布尔类型 (UFBoolean) |
| 6 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织 (org) |
| 7 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 8 | dataorigin | 数据来源 | dataorigin | varchar(50) |  | 字符串 (String) |
| 9 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 10 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 11 | modifier | 最后修改人 | modifier | varchar(20) |  | 用户 (user) |
| 12 | modifiedtime | 最后修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |