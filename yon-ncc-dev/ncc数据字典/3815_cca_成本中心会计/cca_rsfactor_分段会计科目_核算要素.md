# |<<

**分段会计科目/核算要素 (cca_rsfactor / nc.vo.cca.rulescheme.allocruleset.RSFactorVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1300.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_rsfactor | 主键 | pk_rsfactor | char(20) | √ | 主键 (UFID) |
| 2 | pk_allocruleset | 分摊规则设置主键 | pk_allocruleset | varchar(20) |  | 字符串 (String) |
| 3 | pk_accasoa | 会计科目 | pk_accasoa | varchar(20) |  | 会计科目 (accasoa) |
| 4 | pk_cfactorid | 核算要素 | pk_cfactorid | varchar(20) |  | 要素基本信息 (FactorAsoa) |
| 5 | type | 分类 | type | int |  | 段方向分类 (rulesectiontypeenum) |  | 0=发送方; |