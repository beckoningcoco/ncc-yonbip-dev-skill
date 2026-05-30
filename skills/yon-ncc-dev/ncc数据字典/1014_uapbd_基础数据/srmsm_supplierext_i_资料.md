# |<<

**资料 (srmsm_supplierext_i / nc.vo.bd.supplierext.entity.SupplierExtIVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5496.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_supplierext_i | 供应商资料主键 | pk_supplierext_i | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属业务单元 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | finfotype | 资料类型 | finfotype | varchar(20) |  | 供应商资料类型(自定义档案) (Defdoc-SRM000_0xxxx) |
| 5 | filepath | 文件路径 | filepath | varchar(1000) |  | 字符串 (String) |
| 6 | csrcid | 来源单据id | csrcid | varchar(20) |  | 字符串 (String) |
| 7 | csrcbid | 来源单据bid | csrcbid | varchar(20) |  | 字符串 (String) |