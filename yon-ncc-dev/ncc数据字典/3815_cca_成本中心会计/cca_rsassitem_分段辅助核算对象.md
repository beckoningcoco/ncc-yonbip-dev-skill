# |<<

**分段辅助核算对象 (cca_rsassitem / nc.vo.cca.rulescheme.allocruleset.RSAssItemVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1297.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_rsassitem | 主键 | pk_rsassitem | char(20) | √ | 主键 (UFID) |
| 2 | pk_allocruleset | 分摊规则设置主键 | pk_allocruleset | varchar(20) |  | 字符串 (String) |
| 3 | pk_accassitem | 辅助核算项主键 | pk_accassitem | varchar(20) |  | 会计辅助核算项目 (accassitem) |
| 4 | type | 分类 | type | int |  | 段方向分类 (rulesectiontypeenum) |  | 0=发送方; |