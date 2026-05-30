# |<<

**调整规则 (ufoc_adjvouchrule / nc.vo.ufoc.adjvouchrule.AdjvouchRuleVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5860.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_adjvouchrule | 主键 | pk_adjvouchrule | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 创建组织 | pk_org | varchar(20) |  | 组织 (org) |
| 3 | name | 名称 | name | varchar(200) |  | 多语文本 (MultiLangText) |
| 4 | pk_hbschme | 合并方案 | pk_hbschme | varchar(20) |  | 合并方案 (hbscheme) |
| 5 | pk_repadjschme | 报表调整方案 | pk_repadjschme | varchar(20) |  | 报表调整方案 (adjscheme) |
| 6 | ruletype | 类型 | ruletype | varchar(50) |  | 规则类型 (ruletype) |  | 5=个别报表; |