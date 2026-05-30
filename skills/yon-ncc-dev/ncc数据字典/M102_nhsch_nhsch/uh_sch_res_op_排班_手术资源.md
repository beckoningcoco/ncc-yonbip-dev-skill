# |<<

**排班_手术资源 (uh_sch_res_op / com.yonyou.yh.nhis.sch.sch.vo.SchResOpVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6267.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_resop | 排班资源主键 | pk_resop | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | varchar(20) |  | 组织_业务单元_医卫 (hisorg) |
| 4 | code | 资源编码 | code | varchar(30) |  | 字符串 (String) |
| 5 | name | 资源名称 | name | varchar(50) |  | 字符串 (String) |
| 6 | desc_res | 排班资源描述 | desc_res | varchar(4000) |  | 字符串 (String) |
| 7 | mnecode | 输入码 | mnecode | varchar(50) |  | 字符串 (String) |
| 8 | pk_dept | 资源归属部门 | pk_dept | varchar(20) |  | 组织_部门 (dept) |
| 9 | pk_opt | 对应手术台 | pk_opt | varchar(20) |  | 手术台 (opttbl) |
| 10 | flag_stop | 停止标志 | flag_stop | char(1) |  | 布尔类型 (UFBoolean) | N |
| 11 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 12 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 13 | modifier | 修改人 | modifier | varchar(20) |  | 用户 (user) |
| 14 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |