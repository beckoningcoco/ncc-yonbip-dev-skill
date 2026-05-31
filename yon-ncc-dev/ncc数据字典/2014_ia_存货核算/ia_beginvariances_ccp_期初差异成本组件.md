# |<<

**期初差异成本组件 (ia_beginvariances_ccp / nc.vo.ia.beginvariance.entity.BeginVarianceCcpVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2793.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cccpdetailid | 主键 | cccpdetailid | char(20) | √ | 主键 (UFID) |
| 2 | cbeginvariancesid | 期初差异主键 | cbeginvariancesid | char(20) |  | 主键 (UFID) |
| 3 | ccostcompid | 成本组件主键 | ccostcompid | varchar(20) |  | 成本组件 (bd_costcomponent) |
| 4 | pk_group | 集团 | pk_group | varchar(50) |  | 字符串 (String) |
| 5 | nppv | PPV | nppv | decimal(28, 8) |  | 数值 (UFDouble) |
| 6 | nipv | IPV | nipv | decimal(28, 8) |  | 数值 (UFDouble) |
| 7 | nupppv | 上层PPV | nupppv | decimal(28, 8) |  | 数值 (UFDouble) |
| 8 | nupipv | 上层IPV | nupipv | decimal(28, 8) |  | 数值 (UFDouble) |