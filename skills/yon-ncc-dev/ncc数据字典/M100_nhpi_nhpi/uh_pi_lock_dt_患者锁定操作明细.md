# |<<

**患者锁定操作明细 (uh_pi_lock_dt / com.yonyou.yh.nhis.pi.patilock.vo.PatiLockOpVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6198.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_patilockdt | 患者锁详细主键 | pk_patilockdt | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | varchar(20) |  | 组织_业务单元_医卫 (hisorg) |
| 4 | dict | 操作方向 | dict | int |  | 操作方向 (patidictenum) |  | 0=解锁; |