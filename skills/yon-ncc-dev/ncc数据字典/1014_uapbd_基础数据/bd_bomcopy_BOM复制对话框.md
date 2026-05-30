# |<<

**BOM复制对话框 (bd_bomcopy / nc.vo.bd.bom.bom0214.entity.BomcopyVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/380.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | bomcopyid | 复制BOM | bomcopyid | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 计划组织 | pk_org | varchar(20) | √ | 组织 (org) |
| 3 | copymode | 已存在版本 | copymode | int | √ | 已存在版本 (CopyModeEnum) |  | 0=不复制BOM; |