# |<<

**销差单 (hrkq_tripoff / nccloud.vo.hrkq.tripoff.TripoffVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2721.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_tripoff | 主键 | pk_tripoff | char(20) | √ | 主键 (UFID) |
| 2 | billtype | 单据类型 | billtype | varchar(50) |  | 字符串 (String) |
| 3 | mainid | 出差单主表id | mainid | varchar(50) |  | 字符串 (String) |
| 4 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织 (org) |
| 5 | pk_dept | 所属部门 | pk_dept | varchar(20) |  | 组织_部门 (dept) |
| 6 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 7 | pk_psndoc | 人员id | pk_psndoc | varchar(20) |  | 人员基本信息 (bd_psndoc) |
| 8 | triptypeid | 出差类型ID | triptypeid | varchar(20) |  | 出差类型 (ts_triptype) |
| 9 | tripbegintime | 出差开始时间 | tripbegintime | char(19) |  | 日期时间 (UFDateTime) |
| 10 | tripendtime | 出差结束时间 | tripendtime | char(19) |  | 日期时间 (UFDateTime) |
| 11 | tripday | 出差时长 | tripday | decimal(28, 8) |  | 数值 (UFDouble) |
| 12 | minunit | 出差单位 | minunit | int |  | 请假时长单位 (leaveminunit) |  | 1=小时; |