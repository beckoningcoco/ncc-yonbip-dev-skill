# |<<

**计算规则子实体 (sr_plcy_calrule / nc.vo.sr.policy.entity.PlcyCalruleVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5462.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_plcy_calrule | 计算规则子实体 | pk_plcy_calrule | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | vjudgeformula | 返利依据 | vjudgeformula | varchar(500) |  | 返利取数函数 (formula) |
| 4 | fcalmodeflag | 返利计算模式 | fcalmodeflag | int |  | 计算模式 (CalMode) |  | 0=返利依据*返利价格; |