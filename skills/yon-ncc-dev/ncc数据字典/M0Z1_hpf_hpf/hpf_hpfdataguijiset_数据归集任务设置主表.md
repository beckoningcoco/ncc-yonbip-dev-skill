# |<<

**数据归集任务设置主表 (hpf_hpfdataguijiset / nc.vo.hpf.hpfdataguijiset.HpfDataguijiSetVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2634.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_dataguijiset | 主键 | pk_dataguijiset | char(20) | √ | 主键 (UFID) |
| 2 | taskcode | 任务编码 | taskcode | varchar(50) |  | 字符串 (String) |
| 3 | taskname | 任务名称 | taskname | varchar(50) |  | 字符串 (String) |
| 4 | itype | 来源类型 | itype | int |  | 系统类型 (SysTypeEnum) |  | 1=内部系统; |