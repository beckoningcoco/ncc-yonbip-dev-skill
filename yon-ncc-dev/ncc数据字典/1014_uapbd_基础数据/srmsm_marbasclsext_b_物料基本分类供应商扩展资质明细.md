# |<<

**物料基本分类供应商扩展资质明细 (srmsm_marbasclsext_b / nc.vo.bd.marbasclsext.entity.MarBasClsExtBVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5493.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_marbasclsext_b | 物料分类供应商扩展资质明细主键 | pk_marbasclsext_b | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 业务单元最新版本 | pk_org | varchar(20) |  | 组织_业务单元_采购组织 (purchaseorg) |
| 4 | pk_org_v | 业务单元 | pk_org_v | varchar(20) |  | 组织_业务单元_采购组织版本信息 (purchaseorg_v) |
| 5 | cmarbasclsid | 物料基本分类主键 | cmarbasclsid | varchar(20) |  | 字符串 (String) |
| 6 | cqualifyid | 资质编码 | cqualifyid | varchar(20) |  | 供应商资质档案 (supqualidoc) |
| 7 | modify_date | 更新日期 | modify_date | char(19) |  | 日期 (UFDate) |
| 8 | memo | 备注 | memo | varchar(100) |  | 字符串 (String) |
| 9 | vdef1 | 自定义项1 | vdef1 | varchar(101) |  | 自定义项 (Custom) |
| 10 | vdef2 | 自定义项2 | vdef2 | varchar(101) |  | 自定义项 (Custom) |
| 11 | vdef3 | 自定义项3 | vdef3 | varchar(101) |  | 自定义项 (Custom) |
| 12 | vdef4 | 自定义项4 | vdef4 | varchar(101) |  | 自定义项 (Custom) |
| 13 | vdef5 | 自定义项5 | vdef5 | varchar(101) |  | 自定义项 (Custom) |