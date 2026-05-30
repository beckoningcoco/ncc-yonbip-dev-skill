# |<<

**采集表信息 (iufo_report / nc.vo.iuforeport.rep.ReportVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3499.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_report | 报表主键 | pk_report | char(20) | √ | 主键 (UFID) |
| 2 | code | 报表表样编码 | code | varchar(20) |  | 字符串 (String) |
| 3 | name | 报表表样名称 | name | varchar(200) |  | 多语文本 (MultiLangText) |
| 4 | pk_dir | 报表表样分类 | pk_dir | varchar(20) |  | 报表目录 (reportdir) |
| 5 | pk_key_comb | 关键字组合 | pk_key_comb | varchar(20) |  | 关键字组合 (关键字组合) |
| 6 | repinfo | REPINFO | repinfo | image |  | BLOB (BLOB) |
| 7 | fmledit_type | 取数单元格允许编辑 | fmledit_type | int |  | 指标单元格允许编辑 (fmlEditType) |  | 0=取任务参数值; |