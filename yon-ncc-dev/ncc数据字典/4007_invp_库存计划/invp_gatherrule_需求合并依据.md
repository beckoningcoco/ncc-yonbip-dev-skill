# |<<

**需求合并依据 (invp_gatherrule / nc.vo.invp.balance.entity.GatherRuleVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3137.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_gatherrule | 需求合并依据主键 | pk_gatherrule | char(20) | √ | 主键 (UFID) |
| 2 | bstockorg | 库存组织 | bstockorg | char(1) | √ | 布尔类型 (UFBoolean) |
| 3 | boristockorg | 原始需求库存组织 | boristockorg | char(1) |  | 布尔类型 (UFBoolean) |
| 4 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 5 | bmaterial | 物料 | bmaterial | char(1) | √ | 布尔类型 (UFBoolean) |
| 6 | buncombine | 不合并 | buncombine | char(1) | √ | 布尔类型 (UFBoolean) |
| 7 | demanddatenum | 需求日期合并天数 | demanddatenum | decimal(28, 8) |  | 数值 (UFDouble) |
| 8 | bdemanddate | 需求日期 | bdemanddate | char(1) | √ | 布尔类型 (UFBoolean) |
| 9 | bvbillcode | 单据号 | bvbillcode | char(1) | √ | 布尔类型 (UFBoolean) |
| 10 | bdept | 申请部门 | bdept | char(1) | √ | 布尔类型 (UFBoolean) |
| 11 | bstorage | 需求仓库 | bstorage | char(1) | √ | 布尔类型 (UFBoolean) |
| 12 | bproject | 项目 | bproject | char(1) | √ | 布尔类型 (UFBoolean) |
| 13 | bproductor | 生产厂商 | bproductor | char(1) | √ | 布尔类型 (UFBoolean) |
| 14 | bproposer | 申请人 | bproposer | char(1) | √ | 布尔类型 (UFBoolean) |
| 15 | bodyvdef | 表体自定义项 | bodyvdef | varchar(50) |  | 字符串 (String) |
| 16 | bdef | 自定义项 | bdef | char(1) | √ | 布尔类型 (UFBoolean) |