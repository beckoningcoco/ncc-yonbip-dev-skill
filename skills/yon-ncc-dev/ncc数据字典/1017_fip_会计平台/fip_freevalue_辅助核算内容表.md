# |<<

**辅助核算内容表 (fip_freevalue / nc.vo.fip.detailbook.FreeValueVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2241.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_freevalue | 辅助核算项主键 | pk_freevalue | char(20) | √ | 主键 (UFID) |
| 2 | checktype | 核算类型 | checktype | varchar(20) |  | 会计辅助核算项目 (accassitem) |
| 3 | checkvalue | 核算内容 | checkvalue | varchar(50) |  | 字符串 (String) |