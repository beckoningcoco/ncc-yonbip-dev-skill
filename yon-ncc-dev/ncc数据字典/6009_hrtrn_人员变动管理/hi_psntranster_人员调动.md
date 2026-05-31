# |<<

**人员调动 (hi_psntranster / nc.vo.trn.transfer.PsntransterVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2600.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_transfer | 主键 | pk_transfer | char(20) | √ | 主键 (UFID) |
| 2 | code | 人员编码 | code | varchar(100) |  | 字符串 (String) |
| 3 | name | 姓名 | name | varchar(100) |  | 字符串 (String) |
| 4 | pk_org | 人事组织 | pk_org | varchar(20) |  | 组织_业务单元_人力资源组织 (hrorg) |
| 5 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 6 | oldpk_hrorg | 原人力资源组织 | oldpk_hrorg | varchar(20) |  | 组织_业务单元_人力资源组织 (hrorg) |
| 7 | oldpk_org | 原行政组织 | oldpk_org | varchar(20) |  | 组织_业务单元_行政组织 (adminorg) |
| 8 | oldpk_psncl | 原人员类别 | oldpk_psncl | varchar(20) |  | 人员类别 (psncl) |
| 9 | oldpk_dept | 原部门 | oldpk_dept | varchar(20) |  | HR部门 (hrdept) |
| 10 | oldpk_post | 原岗位 | oldpk_post | varchar(20) |  | 岗位基本信息 (om_post) |
| 11 | oldpk_job | 原职务 | oldpk_job | varchar(20) |  | 职务 (om_job) |
| 12 | newpk_hrorg | 新人力资源组织 | newpk_hrorg | varchar(20) |  | 组织_业务单元_人力资源组织 (hrorg) |
| 13 | newpk_org | 新行政组织 | newpk_org | varchar(20) |  | 组织_业务单元_行政组织 (adminorg) |
| 14 | newpk_psncl | 新人员类别 | newpk_psncl | varchar(20) |  | 人员类别 (psncl) |
| 15 | newpk_dept | 新部门 | newpk_dept | varchar(20) |  | HR部门 (hrdept) |
| 16 | transfer_date | 调配日期 | transfer_date | char(10) |  | 模糊日期 (UFLiteralDate) |
| 17 | transfer_reason | 调配原因 | transfer_reason | varchar(20) |  | 异动原因(自定义档案) (Defdoc-HRHI001_0xx) |
| 18 | pk_businesstype | 调配业务类型 | pk_businesstype | varchar(20) |  | 异动类型 (trnstype) |
| 19 | transfer_state | 转出状态 | transfer_state | int |  | 转出状态 (Transfer) |  | 1=待接收; |