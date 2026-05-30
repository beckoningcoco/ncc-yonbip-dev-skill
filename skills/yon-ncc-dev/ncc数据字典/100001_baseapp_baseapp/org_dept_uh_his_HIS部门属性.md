# |<<

**HIS部门属性 (org_dept_uh_his / nc.vo.org.HisDeptOtherVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4043.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_deptdoc_sub | 部门子表主键 | pk_deptdoc_sub | char(20) | √ | 主键 (UFID) |
| 2 | pk_dept | 部门主键 | pk_dept | varchar(20) |  | 组织_部门 (dept) |
| 3 | pk_depttype | 部门类型主键 | pk_depttype | varchar(20) |  | 部门类型(自定义档案) (Defdoc-010200) |
| 4 | dt_depttype | 部门类型编码 | dt_depttype | varchar(50) |  | 字符串 (String) |
| 5 | flag_bu | 业务点标志 | flag_bu | char(1) |  | 布尔类型 (UFBoolean) |
| 6 | note | 部门简介 | note | varchar(1000) |  | 备注 (Memo) |
| 7 | bednum | 床位数 | bednum | int |  | 整数 (Integer) |
| 8 | bednum_open | 开放床位数 | bednum_open | int |  | 整数 (Integer) |
| 9 | pk_stddepttype | 标准编码主键 | pk_stddepttype | varchar(20) |  | 标准科室类别(自定义档案) (Defdoc-010202) |
| 10 | dt_stddepttype | 标准编码 | dt_stddepttype | varchar(50) |  | 字符串 (String) |
| 11 | pk_srv_chkin | 对应挂号登记时服务项目 | pk_srv_chkin | char(20) |  | 主键 (UFID) |
| 12 | pk_place | 部门地点 | pk_place | varchar(50) |  | 字符串 (String) |
| 13 | name_place | 地址 | name_place | varchar(50) |  | 字符串 (String) |
| 14 | eu_daycgset | 患者固定费用收费模式 | eu_daycgset | varchar(50) |  | 固定费用收费模式 (DaycgsetEnum) |  | 0=继承全院; |