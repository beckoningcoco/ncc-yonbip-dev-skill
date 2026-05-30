# |<<

**辅助核算内容表 (gl_freevalue / nc.vo.gl.aggvoucher.FreeValueVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2425.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_freevalue | 辅助核算项主键 | pk_freevalue | char(20) | √ | 主键 (UFID) |
| 2 | freevalueid | 辅助核算ID | freevalueid | char(20) |  | 主键 (UFID) |
| 3 | checktype | 核算类型 | checktype | varchar(20) |  | 会计辅助核算项目 (accassitem) |
| 4 | checkvalue | 核算内容 | checkvalue | varchar(200) |  | 字符串 (String) |
| 5 | checkcount | 核算数 | checkcount | int |  | 整数 (Integer) |
| 6 | valuecode | 核算内容编码 | valuecode | varchar(200) |  | 字符串 (String) |
| 7 | valuename | 核算内容名称 | valuename | varchar(300) |  | 字符串 (String) |
| 8 | assindex | 核算组序号 | assindex | int |  | 整数 (Integer) |
| 9 | free1 | 预留字段1 | free1 | varchar(60) |  | 字符串 (String) |
| 10 | free2 | 预留字段2 | free2 | varchar(60) |  | 字符串 (String) |
| 11 | free3 | 预留字段3 | free3 | varchar(60) |  | 字符串 (String) |