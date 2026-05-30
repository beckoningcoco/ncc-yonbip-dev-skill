# |<<

**公共薪资项目 (wa_item / nc.vo.wa.item.WaItemVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6335.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_wa_item | 薪资项目主键 | pk_wa_item | char(20) | √ | 主键 (UFID) |
| 2 | code | 薪资项目编码 | code | varchar(50) |  | 字符串 (String) |
| 3 | name | 薪资项目名称 | name | varchar(100) |  | 多语文本 (MultiLangText) |
| 4 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 5 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织 (org) |
| 6 | category_id | 项目分类 | category_id | varchar(20) |  | 薪资变动原因(自定义档案) (Defdoc-HRWA001_0xx) |
| 7 | mid | 中间项目 | mid | char(1) |  | 布尔类型 (UFBoolean) |
| 8 | itemkey | 薪资项目字段名 | itemkey | varchar(50) |  | 字符串 (String) |
| 9 | iitemtype | 数据类型 | iitemtype | int |  | 数据类型 (typeenum) |  | 0=数值型; |