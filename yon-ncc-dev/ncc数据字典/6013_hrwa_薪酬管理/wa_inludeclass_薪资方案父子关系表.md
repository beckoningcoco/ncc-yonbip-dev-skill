# |<<

**薪资方案父子关系表 (wa_inludeclass / nc.vo.wa.category.WaInludeclassVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6334.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_includeclass | pk_includeclass | pk_includeclass | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属组织 | pk_org | varchar(20) |  | 人力资源组织 (hrhrorg) |
| 4 | pk_parentclass | 父方案 | pk_parentclass | varchar(20) |  | 薪资方案 (WaClassVO) |
| 5 | batch | 发放次数 | batch | int |  | 整数 (Integer) |
| 6 | pk_childclass | 子方案 | pk_childclass | varchar(20) |  | 薪资方案 (WaClassVO) |
| 7 | cyear | 薪资年 | cyear | varchar(50) |  | 字符串 (String) |
| 8 | cperiod | 薪资期间 | cperiod | varchar(50) |  | 字符串 (String) |
| 9 | memo | 备注 | memo | varchar(400) |  | 字符串 (String) |