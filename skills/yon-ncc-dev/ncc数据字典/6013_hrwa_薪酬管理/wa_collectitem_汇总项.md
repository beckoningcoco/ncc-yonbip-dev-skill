# |<<

**汇总项 (wa_collectitem / nc.vo.wa.taxrptitem.CollectItemVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6326.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_wa_collectitem | 汇总主键 | pk_wa_collectitem | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | name | 名称 | name | varchar(200) |  | 多语文本 (MultiLangText) |
| 5 | pk_item | 公共项目字段主键 | pk_item | char(20) |  | 主键 (UFID) |
| 6 | itemid | 公共薪资项目字段编码 | itemid | varchar(50) |  | 字符串 (String) |
| 7 | code | 编码 | code | int |  | 整数 (Integer) |
| 8 | creator | 创建人 | creator | char(20) |  | 主键 (UFID) |
| 9 | creationtime | 创建日期 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 10 | modifier | 修改人 | modifier | char(20) |  | 主键 (UFID) |
| 11 | modifiedtime | 修改日期 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |