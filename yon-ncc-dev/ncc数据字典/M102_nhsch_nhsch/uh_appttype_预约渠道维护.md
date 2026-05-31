# |<<

**预约渠道维护 (uh_appttype / com.yonyou.yh.nhis.sch.appttype.vo.AppttypeVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5912.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_appttype | 预约渠道主键 | pk_appttype | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | varchar(20) |  | 组织_业务单元_医卫 (hisorg) |
| 4 | pk_appttypetype | 预约渠道类型 | pk_appttypetype | varchar(20) |  | 预约渠道(自定义档案) (Defdoc-020100) |
| 5 | dt_appttypetype | 预约渠道类型编码 | dt_appttypetype | varchar(20) |  | 字符串 (String) |
| 6 | code | 预约渠道编码 | code | varchar(30) |  | 字符串 (String) |
| 7 | name | 预约渠道名称 | name | varchar(50) |  | 字符串 (String) |
| 8 | describe | 描述 | describe | varchar(256) |  | 字符串 (String) |
| 9 | eu_pooltype | 号源池类型 | eu_pooltype | int |  | 号源池类型 (PoolTypeEnum) |  | 0=总号源池; |