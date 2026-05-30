# |<<

**分配薪资类别 (wa_assigncls / nc.vo.wa.category.AssignclsVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6320.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_assigncls | 主键 | pk_assigncls | char(20) | √ | 主键 (UFID) |
| 2 | pk_sourcecls | 源类别 | pk_sourcecls | varchar(20) |  | 薪资方案 (WaClassVO) |
| 3 | classid | 分配类别 | classid | char(20) | √ | 主键 (UFID) |
| 4 | pk_org | 所属组织 | pk_org | char(20) |  | 主键 (UFID) |
| 5 | startyear | 起始年 | startyear | char(4) |  | 主键 (UFID) |
| 6 | startperiod | 起始月 | startperiod | char(2) |  | 主键 (UFID) |
| 7 | moduleflag | 模块标志 | moduleflag | int |  | 整数 (Integer) |