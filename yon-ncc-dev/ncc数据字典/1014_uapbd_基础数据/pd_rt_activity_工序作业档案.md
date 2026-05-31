# |<<

**工序作业档案 (pd_rt_activity / nc.vo.bd.rt.rt0008.entity.RtActivityVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4376.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | crtactivityid | 工序作业 | crtactivityid | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 库存组织 | pk_org | varchar(20) |  | 组织_业务单元_库存组织 (stockorg) |
| 4 | pk_org_v | 库存组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_库存组织版本信息 (stockorg_v) |
| 5 | cactivityid | 作业档案 | cactivityid | varchar(20) |  | 作业档案 (bd_activity) |
| 6 | nstandardwknum | 标准作业量 | nstandardwknum | decimal(28, 8) |  | 数值 (UFDouble) |
| 7 | vnote | 备注 | vnote | varchar(181) |  | 字符串 (String) |
| 8 | cmeasureid | 计量单位 | cmeasureid | varchar(20) |  | 计量单位 (measdoc) |
| 9 | deffectdate | 生效时间 | deffectdate | char(19) |  | 日期(开始) (UFDateBegin) |
| 10 | dinvaliddate | 失效时间 | dinvaliddate | char(19) |  | 日期(结束) (UFDateEnd) |
| 11 | billtime | 计费时机 | billtime | varchar(50) |  | 计费时机类型 (billtime) |  | 0=工序完工报告; |