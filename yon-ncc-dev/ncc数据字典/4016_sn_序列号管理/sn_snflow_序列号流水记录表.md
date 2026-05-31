# |<<

**序列号流水记录表 (sn_snflow / nc.vo.sn.snrule.entity.SnFlowVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5378.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_snflow | 主键 | pk_snflow | char(20) | √ | 主键 (UFID) |
| 2 | pk_snrule | 序列号规则 | pk_snrule | varchar(50) |  | 字符串 (String) |
| 3 | vsnseed | 流水依据 | vsnseed | varchar(200) |  | 字符串 (String) |
| 4 | vrealsnseed | 实际流水依据 | vrealsnseed | varchar(200) |  | 字符串 (String) |
| 5 | vlastsn | 流水号 | vlastsn | varchar(50) |  | 字符串 (String) |