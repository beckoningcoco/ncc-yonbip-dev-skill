# |<<

**投资项目负面清单目录 (ipmpg_negative_list / nc.vo.ipmpg.negativelist.NegativeListVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3355.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_negative_list | 表体资金来源主键 | pk_negative_list | char(20) | √ | 主键 (UFID) |
| 2 | code | 清单编码 | code | varchar(50) |  | 字符串 (String) |
| 3 | name | 清单名称 | name | varchar(200) |  | 多语文本 (MultiLangText) |
| 4 | category | 清单类别 | category | varchar(50) |  | 负面清单类别 (NegativeListCategory) |  | 1=禁止类; |