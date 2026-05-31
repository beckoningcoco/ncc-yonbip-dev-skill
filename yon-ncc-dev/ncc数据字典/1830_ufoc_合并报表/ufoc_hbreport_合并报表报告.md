# |<<

**合并报表报告 (ufoc_hbreport / nc.vo.hbbb.hbreport.UnionReportVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5881.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_hbreport | 合并报表标记 | pk_hbreport | char(20) | √ | 主键 (UFID) |
| 2 | pk_report | 报表PK | pk_report | varchar(20) |  | 采集表信息 (reportinfo) |
| 3 | hbstatus | 合并状态 | hbstatus | int |  | 合并状态 (hbstatus) |  | 1=已合并; |