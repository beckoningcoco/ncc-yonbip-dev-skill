# |<<

**负面清单 (ipmdm_indexsys_negative / nc.vo.ipmdm.indexsys.IndexSysNegativeVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3243.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_indexsys_negative | 负面清单主键 | pk_indexsys_negative | char(20) | √ | 主键 (UFID) |
| 2 | pk_negative | 负面清单主表 | pk_negative | varchar(20) |  | 负面清单 (NegativeVO) |
| 3 | pk_negative_list | 负面清单子表 | pk_negative_list | varchar(20) |  | 投资项目负面清单目录 (NegativeListVO) |
| 4 | code | 清单编码 | code | varchar(50) |  | 字符串 (String) |
| 5 | name | 清单名称 | name | varchar(200) |  | 多语文本 (MultiLangText) |
| 6 | category | 清单类别 | category | varchar(50) |  | 负面清单类别 (NegativeListCategory) |  | 1=禁止类; |