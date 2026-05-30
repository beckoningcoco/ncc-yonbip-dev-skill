# |<<

**默认合并方案 (nresa_mergeschemedef / nc.vo.nresa.mergescheme.MergeSchemeDefVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3882.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_mergeschemedef | 默认方案主键 | pk_mergeschemedef | char(20) | √ | 主键 (UFID) |
| 2 | pk_mergescheme | 合并方案 | pk_mergescheme | varchar(20) |  | 合并方案 (MergeSchemeVO) |
| 3 | pk_org | 所属责任核算账簿 | pk_org | varchar(20) |  | 账簿_责任核算账簿 (liabilitybook) |