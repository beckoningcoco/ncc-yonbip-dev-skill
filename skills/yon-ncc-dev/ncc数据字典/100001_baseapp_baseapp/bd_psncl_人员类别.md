# |<<

**人员类别 (bd_psncl / nc.vo.bd.psn.PsnClVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/942.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_psncl | 人员分类主键 | pk_psncl | char(20) | √ | 主键 (UFID) |
| 2 | code | 人员分类编码 | code | varchar(40) |  | 字符串 (String) |
| 3 | name | 人员分类名称 | name | varchar(200) |  | 多语文本 (MultiLangText) |
| 4 | parent_id | 上级人员分类 | parent_id | varchar(20) |  | 人员类别 (psncl) |
| 5 | memo | 备注 | memo | varchar(100) |  | 备注 (Memo) |
| 6 | innercode | 内部码 | innercode | varchar(200) |  | 字符串 (String) |
| 7 | seq | 次序 | seq | varchar(20) |  | 字符串 (String) |
| 8 | dataoriginflag | 分布式 | dataoriginflag | int |  | 数据来源 (dataorigin) | 0 | 0=本级产生; |