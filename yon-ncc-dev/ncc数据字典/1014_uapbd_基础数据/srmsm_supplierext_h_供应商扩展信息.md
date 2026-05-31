# |<<

**供应商扩展信息 (srmsm_supplierext_h / nc.vo.bd.supplierext.entity.SupplierExtHVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5495.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_supplier | 供应商扩展主键 | pk_supplier | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属业务单元 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | csupplierid | 供应商 | csupplierid | varchar(20) |  | 供应商基本信息 (supplier) |
| 5 | csupgradesysid | 供应商等级体系 | csupgradesysid | varchar(20) |  | 供应商等级体系设置 (supplier_grade_sys) |
| 6 | csupgrade | 供应商等级 | csupgrade | varchar(20) |  | 等级信息 (supplier_grade) |
| 7 | deffectenddate | 合格有效期至 | deffectenddate | char(19) |  | 日期(结束) (UFDateEnd) |
| 8 | bisfirstlogin | 第一次登陆 | bisfirstlogin | char(1) |  | 布尔类型 (UFBoolean) |
| 9 | bisread | 已读 | bisread | char(1) |  | 布尔类型 (UFBoolean) |
| 10 | bisblack | 黑名单 | bisblack | char(1) |  | 布尔类型 (UFBoolean) |
| 11 | dblackdate | 进入黑名单日期 | dblackdate | char(19) |  | 日期 (UFDate) |
| 12 | cblackoperator | 放入黑名单人 | cblackoperator | varchar(20) |  | 用户 (user) |
| 13 | pk_blacklistapply | 黑名单申请单 | pk_blacklistapply | varchar(20) |  | 字符串 (String) |
| 14 | fentprop | 企业性质 | fentprop | int |  | 企业性质 (CorpPropertyEnum) |  | 1=上市公司; |