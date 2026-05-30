# |<<

**资质 (srmsm_supplierext_q / nc.vo.bd.supplierext.entity.SupplierExtQVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5498.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_supplierext_q | 供应商资质主键 | pk_supplierext_q | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属业务单元 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | cqualifysysid | 资质编码 | cqualifysysid | varchar(20) |  | 供应商资质档案 (supqualidoc) |
| 5 | cqualifygrade | 资质等级 | cqualifygrade | varchar(20) |  | 资质等级 (supqualilevel) |
| 6 | dqeffectenddate | 合格有效期至 | dqeffectenddate | char(19) |  | 日期(结束) (UFDateEnd) |
| 7 | filepath | 文件路径 | filepath | varchar(1000) |  | 字符串 (String) |
| 8 | csrcid | 来源单据id | csrcid | varchar(20) |  | 字符串 (String) |
| 9 | csrcbid | 来源单据bid | csrcbid | varchar(20) |  | 字符串 (String) |