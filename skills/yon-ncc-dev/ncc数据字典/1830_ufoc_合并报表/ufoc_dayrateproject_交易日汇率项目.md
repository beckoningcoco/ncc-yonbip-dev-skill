# |<<

**交易日汇率项目 (ufoc_dayrateproject / nc.vo.ufoc.convert.DayrateProjectVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5871.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_dayrateproject | 主键 | pk_dayrateproject | char(20) | √ | 主键 (UFID) |
| 2 | name | 名称 | name | varchar(200) |  | 多语文本 (MultiLangText) |
| 3 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 4 | pk_org | 组织 | pk_org | varchar(20) |  | 组织 (org) |
| 5 | position | 序号 | position | int |  | 整数 (Integer) |
| 6 | amount | 发生额 | amount | char(1) |  | 布尔类型 (UFBoolean) |
| 7 | balance | 余额 | balance | char(1) |  | 布尔类型 (UFBoolean) |
| 8 | dataorigin | 数据来源 | dataorigin | varchar(50) |  | 字符串 (String) |
| 9 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 10 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 11 | modifier | 修改人 | modifier | varchar(20) |  | 用户 (user) |
| 12 | modifiedtime | 最后修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |