# |<<

**参数设置 (pub_sysinit / nc.vo.pub.para.SysInitVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4775.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_sysinit | 主键 | pk_sysinit | char(20) | √ | 字符串 (String) |
| 2 | sysinit | 关联模板 | sysinit | varchar(20) | √ | 字符串 (String) |
| 3 | value | 参数值 | value | varchar(512) |  | 字符串 (String) |
| 4 | pk_org | 组织主键 | pk_org | varchar(20) |  | 组织 (org) |
| 5 | initname | 参数名称 | initname | varchar(512) |  | 字符串 (String) |
| 6 | initcode | 参数编码 | initcode | varchar(50) |  | 字符串 (String) |
| 7 | editflag | 是否可编辑 | editflag | char(1) |  | 布尔类型 (UFBoolean) |
| 8 | controlflag | 是否控制下级 | controlflag | char(1) |  | 布尔类型 (UFBoolean) |
| 9 | dataoriginflag | 分布式 | dataoriginflag | int |  | 数据来源 (dataorigin) |  | 0=本级产生; |