# |<<

**合并方案 (nresa_mergescheme / nc.vo.nresa.mergescheme.MergeSchemeVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3881.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_mergescheme | 合并方案主键 | pk_mergescheme | char(20) | √ | 主键 (UFID) |
| 2 | schemecode | 编码 | schemecode | varchar(50) |  | 字符串 (String) |
| 3 | schemename | 名称 | schemename | varchar(200) |  | 多语文本 (MultiLangText) |
| 4 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 5 | pk_org | 所属组织-责任核算账簿 | pk_org | varchar(20) |  | 账簿_责任核算账簿 (liabilitybook) |
| 6 | mergeorder | 合并顺序 | mergeorder | int |  | 分录合并顺序 (MergeOrder) |  | 1=先借后贷; |